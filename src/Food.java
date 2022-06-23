import java.util.ArrayList;

public class Food {
    public static class Pizza {
        private int sugar_g;
        private int fiber_g;
        private int serving_size_g;
        private int sodium_mg;
        private String name;
        private int potasssium_g;
        private int fat_saturated_g;
        private int fat_total_g;
        private int calories;
        private int cholesterol_mg;
        private int protein_g;
        private int carbohydrates_total_g;

        public Pizza() {

        }

        ;

        public Pizza(String name, int sugar, int fiber_g, int serving_size_g, int sodium_mg, int potasssium_g, int fat_saturated_g,
                     int fat_total_g, int calories, int cholesterol_mg, int protein_g, int carbohydrates_total_g) {
            this.sugar_g = sugar_g;
            this.name = name;
            this.fiber_g = fiber_g;
            this.serving_size_g = serving_size_g;
            this.potasssium_g = potasssium_g;
            this.fat_saturated_g = fat_saturated_g;
            this.fat_total_g = fat_total_g;
            this.calories = calories;
            this.cholesterol_mg = cholesterol_mg;
            this.protein_g = protein_g;
            this.carbohydrates_total_g = carbohydrates_total_g;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSugar_g() {
            return this.sugar_g;
        }

        public void setSugar_g(int sugar_g) {
            this.sugar_g = sugar_g;
        }

        public int getFiber_g() {
            return this.fiber_g;
        }

        public void setFiber_g(int sugar_g) {
            this.fiber_g = fiber_g;
        }

        public int getServing_size_g() {
            return this.serving_size_g;
        }

        public void setServing_size_g(int serving_size_g) {
            this.serving_size_g = serving_size_g;
        }

        public int getPotasssium_g() {
            return this.potasssium_g;
        }

        public void setPotasssium_g(int potasssium_g) {
            this.potasssium_g = potasssium_g;
        }

        public int getFat_saturated_g() {
            return this.fat_saturated_g;
        }

        public void setFat_saturated_g(int fat_saturated_g) {
            this.fat_saturated_g = fat_saturated_g;
        }

        public int getFat_total_g() {
            return this.fat_total_g;
        }

        public void setFat_total_g(int fat_total_g) {
            this.fat_total_g = fat_total_g;
        }

        public int getCalories() {
            return this.calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        public int getCholesterol_mg() {
            return this.cholesterol_mg;
        }

        public void setCholesterol_mg(int cholesterol_mg) {
            this.cholesterol_mg = cholesterol_mg;
        }

        public int getProtein_g() {
            return this.protein_g;
        }

        public void setProtein_g(int protein_g) {
            this.protein_g = protein_g;
        }

        public int getCarbohydrates_total_g() {
            return this.carbohydrates_total_g;
        }

        public void setCarbohydrates_total_g(int carbohydrates_total_g) {
            this.carbohydrates_total_g = carbohydrates_total_g;
        }
        public static void main(String[] args) {
            ArrayList<Pizza> Toyota = new ArrayList<>();
            Pizza FoodProduct = new Food.Pizza();
            FoodProduct.setName("piza  ya");
            FoodProduct.setCalories(89);
            FoodProduct.setCarbohydrates_total_g(45);
            FoodProduct.setCholesterol_mg(45);
            FoodProduct.setProtein_g(56);
            FoodProduct.setFiber_g(23);
            FoodProduct.setFat_saturated_g(89);
            FoodProduct.setServing_size_g(79);

        }
    }
}
