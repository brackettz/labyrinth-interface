const { JavaGenerator, JAVA_COMMON_PRESET } = require("@asyncapi/modelina");
const fs = require("fs");
const { Parser } = require("@asyncapi/parser");

async function main() {
  const yaml = fs.readFileSync("docs/GameServer_asyncapi.yml", "utf8");

  const parser = new Parser();
  const { document } = await parser.parse(yaml);

  const generator = new JavaGenerator({
    presets: [JAVA_COMMON_PRESET]
  });

  const models = await generator.generateCompleteModels(document, {
    packageName: "labyrinth.contracts.models",
  });


  if (!fs.existsSync("./models/async")) {
    fs.mkdirSync("./models/async");
  }


  const typeKeywords = ["class", "interface", "enum", "record"];

  for (const model of models) {
    const dtoName = `${model.modelName}Dto`;

    let java = model.result;

    for (const keyword of typeKeywords) {
      const regex = new RegExp(`${keyword}\\s+${model.modelName}\\b`);
      java = java.replace(regex, `${keyword} ${dtoName}`);
    }

    fs.writeFileSync(`./models/async/${dtoName}.java`, java);
    console.log("Generated:", dtoName);
  }
}

main().catch(console.error);
