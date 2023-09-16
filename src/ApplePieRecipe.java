public class ApplePieRecipe {

    Ingredient ongezoutenRoomboter = new Ingredient(200, "gram", "Ongezouten roomboter");
    Ingredient witteBastardSuiker = new Ingredient(200, "gram", "Witte bastard suiker");
    Ingredient zelfrijzendBakmeel = new Ingredient(400, "gram", "Zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(1, "stuk(s)", "Ei");
    Ingredient vanillesuiker = new Ingredient(8, "gram", "Vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "Zout");
    Ingredient zoetzureAppels = new Ingredient(1.5, "kilo", "Zoetzure appels");
    Ingredient kristalSuiker = new Ingredient(75, "gram", "Kristal suiker");
    Ingredient kaneel = new Ingredient(3, "theelepel(s)", "Kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "Paneermeel");


    public void printIngredients() {
        System.out.println(ongezoutenRoomboter.getAmount() + " " + ongezoutenRoomboter.getUnit() + " " + ongezoutenRoomboter.getName());
        System.out.println(witteBastardSuiker.getAmount() + " " + witteBastardSuiker.getUnit() + " " + witteBastardSuiker.getName());
        System.out.println(zelfrijzendBakmeel.getAmount() + " " + zelfrijzendBakmeel.getUnit() + " " + zelfrijzendBakmeel.getName());
        System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
        System.out.println(vanillesuiker.getAmount() + " " + vanillesuiker.getUnit() + " " + vanillesuiker.getName());
        System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
        System.out.println(zoetzureAppels.getAmount() + " " + zoetzureAppels.getUnit() + " " + zoetzureAppels.getName());
        System.out.println(kristalSuiker.getAmount() + " " + kristalSuiker.getUnit() + " " + kristalSuiker.getName());
        System.out.println(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName());
        System.out.println(paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName());
    }

    public void printAllSteps() {
        verwarmOven();
        kloptHetEi();
        mengDeBoter();
        schilAppels();
        gebruikDeeg();
        verdeelAppels();
        rolDeeg();
        legStroken();
        bakTaart();
    }


    //    Stap 1
    public void verwarmOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    //    Stap 2
    public void kloptHetEi() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    //    Stap 3
    public void mengDeBoter() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    //    Stap 4
    public void schilAppels() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    //    Stap 5
    public void vetSpringvorm() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }

    //    Stap 6
    public void gebruikDeeg() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    //    Stap 7
    public void verdeelAppels() {
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    //    Stap 8
    public void rolDeeg() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    //    Stap 9
    public void legStroken() {
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    //    Stap 10
    public void bakTaart() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }


}
