package ru.rzn.sbt.javaschool.lesson3.hobby;

public class Solution {
    /**
     * Хобби
     *
     * Реализуйте метод detect таким образом, чтобы определить из входного массива students количество
     * студентов, занимающихся музыкой {@link Rockstar}, студентов, увлекающихся мотоциклами {@link Biker} и студентов
     * без хобби {@link Student} (такие студенты не должны быть ни {@link Rockstar}, ни {@link Biker}), и разместите
     * результат в виде объекта класса {@link DetectionResult} с заполненными соответствующими полями.
     * Случаи с null-ссылкой на массив и null-элементами массива следует обрабатывать.
     */
    public static DetectionResult detect(Object[] students) {

        DetectionResult result = new DetectionResult();
        if (students==null) return result;

        for (Object student:students) {
            if (student==null) continue;
            if (student instanceof Biker){
                  result.setBikersCount(result.getBikersCount()+1);
            }
            else if (student instanceof Rockstar){
                   result.setRockstarsCount(result.getRockstarsCount()+1);
            }
            else if (student instanceof Student){
                   result.setPureStudentsCount(result.getPureStudentsCount()+1);
            }
        }
        return result;
    }
}
