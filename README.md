<p align="center">
  <img alt="Defiman" src="./logo.png" width="150" />
</p>

# DeFiMan : Portable Desktop Finance Manager
![License](https://img.shields.io/badge/license-MIT-blue)
![Project Status](https://img.shields.io/badge/Status-In%20Development-red)
![Last Commit](https://img.shields.io/github/last-commit/Samestora/DeFiMan)

## Table of Contents
* [Installation](#installation)
    * [Requirements](#requirements)
* [Usage](#usage)
* [Contributing](#contributing)
* [License](#license)

## Installation

### Requirements
- [Java JDK 21](https://oracle.com/java/)

Download the `defiman-x.y.z.jar` file and execute it by :
> [!CAUTION]
> __DO NOT__ run this script unless you do fully understand what this does. Seriously, __DO NOT!__

```bash
bash -c "$(wget -qO - https://raw.github.com/Samestora/DeFiMan/releases/download/defiman-x.y.z.jar)"
java -jar defiman-x.y.z.jar
```

But, this project is still under development 🌵

## Usage
Track all of your financial records here, a Defiman account is needed.

## Contributing
Clone this repository to your working directory

### Requirements
- [Java JDK 21](https://oracle.com/java/)
- [JavaFX SDK 21](https://openjfx.io/)
- [Apache Maven 3.8.8](https://maven.apache.org/s)
- [PostgreSQL](https://www.postgresql.org/)

Set all of the requirements to your `PATH` , all of the resources above should tell you how.  

Whenever you try to run the app, use :
```bash
mvn clean javafx:run
```

## License
This software is licensed under [MIT License](./LICENSE)