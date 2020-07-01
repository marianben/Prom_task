package tas_promt.demo.Plaing_Card;

public class TestDeck {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Deck myDeck = new Deck();

        System.out.println("******** Ordered ****************");
        for(int i = 0; i < 36; i++){
            System.out.print(myDeck.getCards()[i].getRank().getName() + "; ");
            System.out.println(myDeck.getCards()[i].getSuit().getName());

        }

        System.out.println("********* Messed ***************");
        myDeck.shuffle();

        for(int i = 0; i < 36; i++){
            System.out.print(i + ". " + myDeck.getCards()[i].getRank().getName() + "; ");
            System.out.println(myDeck.getCards()[i].getSuit().getName());

        }

        System.out.println("********* Ordered ***************");
        myDeck.order();

        for(int i = 0; i < 36; i++){
            System.out.print(i + ". " + myDeck.getCards()[i].getRank().getName() + "; ");
            System.out.println(myDeck.getCards()[i].getSuit().getName());

        }

        System.out.println("------drawOne--------");
        myDeck.drawOne();

        for(int i = myDeck.getCards().length-1; i >=0 ; i--){
            System.out.print(i + ". " + myDeck.getCards()[i].getRank().getName() + "; ");
            System.out.println(myDeck.getCards()[i].getSuit().getName());

        }

    }
}