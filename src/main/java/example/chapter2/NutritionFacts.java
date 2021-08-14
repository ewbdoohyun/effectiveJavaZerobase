//package example.chapter2;
//
//import lombok.Builder;
//import lombok.Data;
//
//@Data
//@Builder(builderMethodName = "hiddenBuilder")
//public class NutritionFacts {
//    private final int servingSize;  // ml, 1회 제공량 필수
//    private final int servings;     // 회, 총 n회 제공량) 필수
//    @Builder.Default
//    private final int calories = 0;     // 1회 제공량당 (need)
//    @Builder.Default
//    private final int fat = 0;          // g/1회 제공량(option)
//    @Builder.Default
//    private final int solium = 0;       // mg/1회 제공량 (option)
//    @Builder.Default
//    private final int carbohydrate = 0; // g/1회 제공량 (option)
//
//    public static NutritionFactsBuilder builder(int servingSize, int servings){
//        return hiddenBuilder()
//                .servingSize(servingSize)
//                .servings(servings);
//    }
//
//    NyPizza pizza =
//}
