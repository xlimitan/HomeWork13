public class Main {
    public static void main(String[] args) {
        Gryffindor[] studentGryffindor = {
                new Gryffindor("Harry Potter", 100, 70, 95, 80, 85),
                new Gryffindor("Hermione Granger", 80, 80, 90,75,80),
                new Gryffindor("Ron Weasley", 60, 70, 75, 75, 85)
        };
        Hufflepuff[] studentHufflepuff = {
                new Hufflepuff("Zachariah Smith", 65,70,85,50,65),
                new Hufflepuff("Cedric Diggory", 75, 70, 55, 45, 60),
                new Hufflepuff("Justin Finch-Fletchley",50, 80, 90, 50, 80)
        };
        Ravenclaw[] studentRavenclaw = {
                new Ravenclaw("Zhou Chang", 40, 50, 60, 70, 80, 90),
                new Ravenclaw("Padma Patil", 50, 40, 45, 55, 65,70),
                new Ravenclaw("Marcus Belby", 60, 85,50, 45,75,80)
        };
        Slytherin[] studentSlytherin = {
                new Slytherin("Draco Malfoy", 60, 70, 75, 80,50, 65,50),
                new Slytherin("Graham Montague", 40, 35, 50, 45, 35, 60, 45),
                new Slytherin("Gregory Goyle", 30, 30, 45, 50, 40, 20, 30)
        };

        studentGryffindor[0].compareTo(studentHufflepuff[0]);
        studentGryffindor[0].innerCompareTo(studentGryffindor[1]);
        System.out.println(studentGryffindor[1].toString());
        System.out.println(studentSlytherin[1].toString());
    }
    
}