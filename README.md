# Software engineering exercises

Course exercises covering Java, design patterns, UML diagrams, and model-driven Java examples.

## Repository guide

- [Design Pattern](Design%20Pattern): Java examples organized by pattern, including adapter, factory, observer, singleton, and strategy.
- [Class diagram exercises](Esercitazione%204%20-%20Class%20Diagram): library and vehicle models, Java files, and PDF exercise material. The library exercise also includes a separate teacher's solution.
- [State machine diagrams](Esercitazione%205-%20State%20machine%20diagram), [sequence diagrams](Esercitazione%206-%20Sequence%20diagrams), and [activity diagrams](Esercitazione%207-%20Activity%20diagram): `.mdj` model files.
- [Lessons](Lessons): additional models and Java examples.
- [Testing](Testing): counter and rectangle testing exercises.

## Working with the examples

Treat each exercise as a separate project, not as a single source tree to compile together: several folders contain alternative versions of the same classes.

For folders with `.project` and `.classpath` files, import the individual project into Eclipse using your own workspace, rather than reusing the repository's `.metadata` directory. The [Testing classpath](Testing/.classpath) targets JavaSE-16, declares JUnit 4, and uses `src`, `Test`, and `EsercizioRettangolo` as source folders. Preserve those source roots when configuring that exercise; its tests are not all under `src`.

Keep the `.mdj` diagram models alongside their related Java examples when browsing the modeling exercises.
