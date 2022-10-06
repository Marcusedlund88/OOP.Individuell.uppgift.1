package OOP.Sprint1.Individuell1;

//Enumeration, enum, PlantSpecifics provides FINAL unchangeable information regarding each of the specific subclasses.
//In this example: Type of water and base/extra amount of nutrition.

enum PlantSpecifics {

        CACTUS("Mineral water",0.02,0),
        PALM("Standard water",0.5,0),
        CARNIVOROUS("Protein water",0.1,0.2);
        final String typeOfNutrition;
        final double baseAmount;
        final double extraAmount;
        PlantSpecifics(String typeOfNutrition, double baseAmount, double extraAmount){
                this.typeOfNutrition = typeOfNutrition;
                this.baseAmount = baseAmount;
                this.extraAmount = extraAmount;
        }

}
