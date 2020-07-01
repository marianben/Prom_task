package tas_promt.demo.Plaing_Card;
/*
public class Deck {

    Card [] cards;
    int indexCard;

    public Deck() {
        this.cards = new Card[36];
        int index = 0;
        for (Rank rank : Rank.values) {
            for (Suit suit : Suit.values) {
                Card card = new Card(rank, suit);
                this.cards[index++] = card;
            }
        }
        this.indexCard = 0;
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        for (int i = 0; i < (int)(Math.random() * 1000); i++) {
            int index1 = (int)(Math.random() * 35);
            int index2 = (int)(Math.random() * 35);
            if (index1 != index2) {
                Card card = this.cards[index1];
                this.cards[index1] = this.cards[index2];
                this.cards[index2] = card;
            }
        }
        this.indexCard = 0;


    }

    /* * Впорядкування колоди за мастями та значеннями
     * Порядок сотрування:
     * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
     * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
     * Наприклад
     * HEARTS Ace
     * HEARTS King
     * HEARTS Queen
     * HEARTS Jack
     * HEARTS 10
     * HEARTS 9
     * HEARTS 8
     * HEARTS 7
     * HEARTS 6
     * І так далі для DIAMONDS, CLUBS, SPADES
    public void order() {
       /* this.indexCard = 0;
        for (Suit suit : Suit.values) {
            for (Rank rank : Rank.values) {
                Card card = new Card(rank, suit);
                for (int i = this.indexCard; i < this.cards.length; i++) {
                    Card currentCard = this.cards[i];
                    if (card.getSuit().equals(currentCard.getSuit())
                            && card.getRank().equals(currentCard.getRank())){
                        if (this.indexCard != i) {
                            Card temp = this.cards[this.indexCard];
                            this.cards[this.indexCard] = card;
                            this.cards[i] = temp;
                        }
                        this.indexCard++;
                        break;
                    }
                }
            }
        }
        this.indexCard = 0;

        boolean ord = true;
        int z=0;
        while(ord){
            ord=false;
            for (int i = 0; i<cards.length-1-z; z++){
                Card a  = cards[i];
                cards[i]=cards[i+1];
                cards[i+1]=a;
                ord=true;
            }
        }

    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
     return this.indexCard<36;
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
         public Card drawOne() {
             return hasNext() ? this.cards[this.indexCard--] : null;

    }
  */
public class Deck {
        public static final int CARDS_NUMBER = 36;
        public static final int RANKS_NUMBER = 9;
        public static final int SUIT_NUMBER = 4;
        private Card[] cards = new Card[CARDS_NUMBER];
        private Card currentCard;
        private int currentCardNumber;

        public Deck() {
            currentCardNumber = 0;
            for(int i = 0; i < RANKS_NUMBER; i++){
                for(int j = 0; j < SUIT_NUMBER; j++){
                    cards[currentCardNumber++] = new Card(Rank.values[i], Suit.values[j]);
                }
            }
        }

        //Перемішує колоду у випадковому порядку
        public void shuffle() {
            Card[] tempCards = new Card[CARDS_NUMBER];
            currentCardNumber = 0;
            while(currentCardNumber < CARDS_NUMBER){
                int randomPossition = rnd(CARDS_NUMBER);
                if(cards[randomPossition] != null){
                    tempCards[currentCardNumber++] = cards[randomPossition];
                    cards[randomPossition] = null;
                }
            }
            cards = tempCards;
            tempCards = null;
        }
        /* * Впорядкування колоди за мастями та значеннями
         * Порядок сотрування:
         * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
         * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
         * Наприклад
         * HEARTS Ace
         * HEARTS King
         * HEARTS Queen
         * HEARTS Jack
         * HEARTS 10
         * HEARTS 9
         * HEARTS 8
         * HEARTS 7
         * HEARTS 6
         * І так далі для DIAMONDS, CLUBS, SPADES */
        public void order() {
            currentCardNumber = 0;
            Card[] tempCards = new Card[CARDS_NUMBER];
            int hearts = 0;
            int diamonds = hearts + RANKS_NUMBER;
            int clubs = diamonds + RANKS_NUMBER;
            int spades = clubs + RANKS_NUMBER;
            int i = 0;
            int j = 0;
            while ( hasNext() ){
                currentCard = drawOne();
                if ("Ace".equals(currentCard.getRank().getName())) {
                    i = 0;

                } else if ("King".equals(currentCard.getRank().getName())) {
                    i = 1;

                } else if ("Queen".equals(currentCard.getRank().getName())) {
                    i = 2;

                } else if ("Jack".equals(currentCard.getRank().getName())) {
                    i = 3;

                } else if ("10".equals(currentCard.getRank().getName())) {
                    i = 4;

                } else if ("9".equals(currentCard.getRank().getName())) {
                    i = 5;

                } else if ("8".equals(currentCard.getRank().getName())) {
                    i = 6;

                } else if ("7".equals(currentCard.getRank().getName())) {
                    i = 7;

                } else if ("6".equals(currentCard.getRank().getName())) {
                    i = 8;

                }

                if ("HEARTS".equals(currentCard.getSuit().getName())) {
                    j = hearts + i;

                } else if ("DIAMONDS".equals(currentCard.getSuit().getName())) {
                    j = diamonds + i;

                } else if ("CLUBS".equals(currentCard.getSuit().getName())) {
                    j = clubs + i;

                } else if ("SPADES".equals(currentCard.getSuit().getName())) {
                    j = spades + i;

                }

                tempCards[j] = currentCard;
            }

            cards = tempCards;
            tempCards = null;

        }

        //Повертає true у випадку коли в колоді ще доступні карти
        public boolean hasNext() {
            if(currentCardNumber < CARDS_NUMBER ) {
                return true;
            }
            return false;
        }

        //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
        //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
        //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
        public Card drawOne() {


            if(currentCardNumber < CARDS_NUMBER){
                return cards[currentCardNumber++];
            }else {
                return null;
            }
        }

        //Получение случайного числа из диапазона от 0 до max
        public static int rnd(int max){
            return (int)(Math.random() * max);
        }

        public Card[] getCards(){
            return cards;
        }
}

