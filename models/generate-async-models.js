const { JavaGenerator } = require("@asyncapi/modelina");
const fs = require("fs");
const { Parser } = require("@asyncapi/parser");   // Klasse importieren

async function main() {
  const yaml = fs.readFileSync("docs/GameServer_asyncapi.yml", "utf8");

  const parser = new Parser();                    // Instanz erzeugen
  const { document } = await parser.parse(yaml); // parse() verwenden

  const generator = new JavaGenerator();
  const models = await generator.generate(document);

  if (!fs.existsSync("./models/async")) {
    fs.mkdirSync("./models/async");
  }

  for (const model of models) {
    const fileName = `./models/async/${model.modelName}.java`;
    fs.writeFileSync(fileName, model.result);
    console.log("Generated:", fileName);
  }
}

main().catch(console.error);
