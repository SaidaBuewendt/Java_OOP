public class Cocktail {
    //  Immutable - неизменяемый
    private String title;
    private Ingredient[] ingredients;
    private int liquid; // в миллилитрах
    private int perCent; //

    public Cocktail(String title, Ingredient... ingredients) {
        this.title = title;
        this.ingredients = ingredients;
        setLiquid();
        setPerCent();
    }

    public int getLiquid() {
        return liquid;
    }

    public String getTitle() {
        return title;
    }

    public int getPerCent() {
        return perCent;
    }

    private void setPerCent() {
        // итоговые проценты = мл*алкоголь
        // (100*0 + 100*40) / все миллилилитры = итоговая крепость
        int result = 0;
        for (int i = 0; i < ingredients.length; i++) {
            result += ingredients[i].getPerCent() * ingredients[i].getLiquid();
        }
        perCent = result / getLiquid();
    }


    private void setLiquid() {
        int result = 0;
/*        for (Ingredient отдельныйИнгредиентик : ingredients) {
            result += отдельныйИнгредиентик.getLiquid();
        }*/
        for (int i = 0; i < ingredients.length; i++) {
            result+= ingredients[i].getLiquid();
        }

        liquid = result;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < ingredients.length; i++) {
            result += "\n" + ingredients[i].toString();
        }

        return "Cocktail{" +
                "title='" + title + '\'' +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                " Состоит из следующих ингредиентов: " + result +
                '}';
    }
}