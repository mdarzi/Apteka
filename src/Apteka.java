public class Apteka {
    public static void main(String[] args) {
        AptInf apteka = new AptInf("наЗдоровье");
        apteka.dobavitLekarstvo(new AptLek("Парацетамол", 50));
        apteka.dobavitLekarstvo(new AptLek("Ибупрофен", 75));
        apteka.dobavitLekarstvo(new AptLek("Анальгин", 30));
        apteka.dobavitLekarstvo(new AptLek("Аспирин", 40));
        apteka.dobavitLekarstvo(new AptLek("Лоратадин", 100));
        apteka.dobavitLekarstvo(new AptLek("Цетиризин", 90));
        System.out.println(apteka.poluchitInformatsiyu());
        System.out.println("Стоимость самого дорогого лекарства: " + apteka.samoeDorogoeLekarstvo() + " руб.");
        System.out.println("Общая стоимость всех лекарств: " + apteka.obshchayaStoimost() + " руб.");
    }
}
