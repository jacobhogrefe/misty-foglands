package com.jacobhogrefe.world.gen;

public class ModWorldGen {
    public static void generateModWorldGen() {
        ModFlowerGeneration.generateFlowers();
        ModTreeGeneration.generateTrees();
        ModOreGeneration.generateOres();
    }
}
