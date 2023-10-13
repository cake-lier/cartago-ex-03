!calculate.

+!calculate : true <-
    makeArtifact("calculator", "io.github.cakelier.Calculator", [], _);
    add(2.5, 1.2, Sum);
    println("2.5 + 1.2 = ", Sum);
    sub(0.3, 5.0, Sub);
    println("0.3 - 5.0 = ", Sub).

{ include("$jacamoJar/templates/common-cartago.asl") }