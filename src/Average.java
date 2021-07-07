public class Average {

    public double averageAge(Student[] yourArray) {
        double agesSum = 0;
        for (int i = 0; i < yourArray.length; i++) {
            agesSum += yourArray[i].getAge();
        }

        return agesSum / yourArray.length;
    }
}
