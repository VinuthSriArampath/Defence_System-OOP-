public class Start {
    public static void main(String args[]){
        MainController main=MainController.getInstant();
        main.addcomponent(new Tank());
        main.addcomponent(new Helicopter());
        main.addcomponent(new SubMarine());
        
    }
}
