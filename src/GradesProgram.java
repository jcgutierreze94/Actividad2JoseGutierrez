public class GradesProgram { //esta es la clase principal donde se almacenara el string, atributos y metodos

    public String name; //este es el atributo donde se almacenara el nombre del estudiante
    public double[] scores; //este es el atributo donde se almacenaran los valores numericos

    public GradesProgram(String name, double[]scores){ // aqui se le asignan los valores a los atributos name y scores
        this.name = name;
        this.scores = scores;
    }

    public double calculateAverage(){ //este metodo nos permite calcular el promedio de los valores numericos
        double sum = 0;
        for (double score : scores){
            sum += score;
        }
        return sum / scores.length;
    }

    public char calculateGrade(double average) { //este metodo nos permite asignar una letra de acuerdo al promedio obtenido
        if (average >= 91) {
            return 'A';
        } else if (average >= 81) {
            return 'B';
        } else if (average >= 71) {
            return 'C';
        } else if (average >= 61) {
            return 'D';
        } else if (average >= 51) {
            return 'E';
        } else {
            return 'F';
        }
    }

    public void printResults(){ // este metodo nos permite imprimir en pantalla los resultados
        double average = calculateAverage();
        char grade = calculateGrade(average);

        System.out.println("Student Name: " + name);
        System.out.println("Average Score: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Scores:");
        for (double score : scores) {
            System.out.println(score);
        }
    }

    public static void main(String[] args) { // con estas lineas de codigo le damos los inputs al programa
        String studentName = "Jose Gutierrez";
        double[] scores = { 85, 88, 90, 95, 98};

        GradesProgram student = new GradesProgram(studentName, scores);
        student.printResults();
    }
}

