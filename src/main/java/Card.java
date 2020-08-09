public class Card {

        final char suit;
        final int value;

        Card(char suit, int value)
        {
            this.suit   = suit;
            this.value  = value;
        }

        private String valueToSymbol(int value)
        {
            switch (value)
            {
                case 2: return "2";
                case 3: return "3";
                case 4: return "4";
                case 5: return "5";
                case 6: return "6";
                case 7: return "7";
                case 8: return "8";
                case 9: return "9";
                case 10: return "T";
                case 11: return "J";
                case 12: return "Q";
                case 13: return "K";
                case 14: return "A";
            }
            return null;
        }

        @Override
        public String toString() { 
            return String.format(valueToSymbol(this.value) + this.suit); 
        } 
}