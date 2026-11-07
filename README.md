<p align="center">
  <picture>
    <source media="(prefers-color-scheme: dark)" srcset="docs/brand/svg/smallest-sd-finder-logo-on-dark.svg">
    <img src="docs/brand/svg/smallest-sd-finder-logo-on-light.svg" alt="Smallest Standard Deviation Finder" width="260">
  </picture>
</p>

<h1 align="center">Compare four lists. Find the steadiest one.</h1>

<p align="center">
  Archived Java coursework from 2019 and 2020, built around Travis CI and Heroku deployment.<br>
  <b>A Spark web app. Four integer lists in, the smallest standard deviation out.</b>
</p>

<p align="center">
  <img alt="Status: archived" src="https://img.shields.io/badge/status-archived-6D597A?style=flat-square">
  <img alt="Written in 2019" src="https://img.shields.io/badge/written-2019-1E2A38?style=flat-square">
  <img alt="Java 8 or newer" src="https://img.shields.io/badge/Java-8%20or%20newer-ED8B00?style=flat-square&logo=openjdk&logoColor=white">
  <img alt="Four lists compared" src="https://img.shields.io/badge/lists%20compared-4-1E2A38?style=flat-square">
  <a href="https://github.com/mertkayacs/Smallest-Standart-Deviation-Finder"><img alt="GitHub stars" src="https://img.shields.io/github/stars/mertkayacs/Smallest-Standart-Deviation-Finder?style=flat-square&logo=github&color=C4A772"></a>
</p>

<p align="center">
  <a href="#quick-start"><img alt="Run it" src="https://img.shields.io/badge/Run%20it-6D597A?style=for-the-badge&logo=data%3Aimage%2Fsvg%2Bxml%3Bbase64%2CPHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAyNCAyNCIgd2lkdGg9IjI0IiBoZWlnaHQ9IjI0Ij48ZyBmaWxsPSJub25lIiBzdHJva2U9IiNmZmZmZmYiIHN0cm9rZS1saW5lY2FwPSJyb3VuZCIgc3Ryb2tlLWxpbmVqb2luPSJyb3VuZCIgc3Ryb2tlLXdpZHRoPSIyIj48cGF0aCBkPSJNMTIgMTloOCIvPjxwYXRoIGQ9Im00IDE3IDYtNi02LTYiLz48L2c%2BPC9zdmc%2B&logoColor=white"></a>
  <a href="src/main/java/com/mycompany/app/App.java"><img alt="Source" src="https://img.shields.io/badge/Source-1E2A38?style=for-the-badge&logo=data%3Aimage%2Fsvg%2Bxml%3Bbase64%2CPHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAyNCAyNCIgd2lkdGg9IjI0IiBoZWlnaHQ9IjI0Ij48ZyBmaWxsPSJub25lIiBzdHJva2U9IiNmZmZmZmYiIHN0cm9rZS1saW5lY2FwPSJyb3VuZCIgc3Ryb2tlLWxpbmVqb2luPSJyb3VuZCIgc3Ryb2tlLXdpZHRoPSIyIj48cGF0aCBkPSJtMTYgMTggNi02LTYtNiIvPjxwYXRoIGQ9Im04IDYtNiA2IDYgNiIvPjwvZz48L3N2Zz4%3D&logoColor=white"></a>
  <a href="https://mertkayacs.com/?utm_source=github&utm_medium=readme&utm_campaign=Smallest-Standart-Deviation-Finder-repo&utm_content=portfolio-badge"><img alt="Portfolio" src="https://img.shields.io/badge/Portfolio-1E2A38?style=for-the-badge&logo=data%3Aimage%2Fsvg%2Bxml%3Bbase64%2CPHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAyNCAyNCIgd2lkdGg9IjI0IiBoZWlnaHQ9IjI0Ij48ZyBmaWxsPSJub25lIiBzdHJva2U9IiNmZmZmZmYiIHN0cm9rZS1saW5lY2FwPSJyb3VuZCIgc3Ryb2tlLWxpbmVqb2luPSJyb3VuZCIgc3Ryb2tlLXdpZHRoPSIyIj48Y2lyY2xlIGN4PSIxMiIgY3k9IjEyIiByPSIxMCIvPjxwYXRoIGQ9Ik0xMiAyYTE0LjUgMTQuNSAwIDAgMCAwIDIwYTE0LjUgMTQuNSAwIDAgMCAwLTIwTTIgMTJoMjAiLz48L2c%2BPC9zdmc%2B&logoColor=white"></a>
</p>

Smallest Standard Deviation Finder is a small Java web app built with Spark and Mustache. A page with four text boxes takes four lists of integers and reports which list has the smallest standard deviation, together with its value. It began as an exercise in continuous integration and deployment, with a Travis CI configuration and a Procfile for Heroku. The Heroku demo no longer responds (HTTP 404 on 7 November 2026), so run the app locally.

---

## Why Smallest Standard Deviation Finder

The project is one page and one calculation, and both are easy to read.

|  |  |
|---|---|
| <img src="docs/assets/readme/icons/list-ordered.svg" width="18" height="18" alt=""> **Four lists, one answer** | Type one integer per line into each of the four boxes. The page names the list with the smallest spread and prints its standard deviation. |
| <img src="docs/assets/readme/icons/sigma.svg" width="18" height="18" alt=""> **Sample standard deviation** | The calculation in [App.java](src/main/java/com/mycompany/app/App.java) divides by n minus 1. An empty list receives a sentinel score of 999. |
| <img src="docs/assets/readme/icons/package.svg" width="18" height="18" alt=""> **Builds to one runnable jar** | `mvn package` runs the assembly plugin and writes a single jar with its dependencies. The Procfile holds the original Heroku start command. |

## Features

**Web app**

- A form at /compute with four text areas.
- The port comes from the PORT environment variable and defaults to 4567.
- Spark Java 2.7.2 with Mustache templates.

**Calculation**

- Reports the first list with the smallest standard deviation, or says that all four are equal.
- Prints the value next to the list position.

**Project files**

- Maven build in pom.xml, JUnit test stub in src/test.
- .travis.yml and Procfile from the original CI and Heroku setup.

## Quick start

```sh
mvn package
java -jar target/myDemoApp-1.0-SNAPSHOT.jar
```

Open `http://localhost:4567/compute`, fill the four boxes and submit.

### Requirements

- Java 8 or newer. The pom compiles for Java 1.8.
- Maven.

## FAQ

<details>
<summary><b>Is the demo still online?</b></summary>

No. The Heroku app it ran on now answers with HTTP 404 (checked on 7 November 2026). Run it locally on port 4567.
</details>

<details>
<summary><b>How do I enter the lists?</b></summary>

One integer per line in each box.
</details>

<details>
<summary><b>Which standard deviation does it use?</b></summary>

The sample standard deviation, with n minus 1 in the divisor. See [App.java](src/main/java/com/mycompany/app/App.java).
</details>

If Smallest Standard Deviation Finder is useful to you, a ⭐ helps other people find it.

[![views](https://hits.sh/github.com/mertkayacs/Smallest-Standart-Deviation-Finder.svg?view=today-total&style=flat-square&label=views&color=6D597A&labelColor=1E2A38)](https://github.com/mertkayacs/Smallest-Standart-Deviation-Finder)
