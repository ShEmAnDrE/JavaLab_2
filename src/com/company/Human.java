package com.company;

public class Human {
    private int age;
    private char gender;
    private int height;
    private String skinColor;
    private static String name;
    private Head head;
    private Leg legs [] = new Leg[2];
    private Hand hands [] = new Hand[2];

    private static class Head {
        private String colorOfHair;
        private String colorOfEyes;
        private boolean integrityOfNose = true;

        public boolean getIntegrityOfNose() {
            return integrityOfNose;
        }

        public void setIntegrityOfNose(boolean integrityOfNose_) {
            if (integrityOfNose == integrityOfNose_) {
                if (integrityOfNose) {
                    System.out.println(name + ": The nose is already whole");
                } else {
                    System.out.println(name + ": The nose is already broken");
                }
            } else {
                integrityOfNose = integrityOfNose_;
                if (integrityOfNose) {
                    System.out.println(name + ": The nose is repaired");
                } else {
                    System.out.println(name + ": The nose is broken");
                }
            }
        }

        public void thinking() {
            System.out.println(name + " thinking about something");
        }

        public void speaking() {
            System.out.println(name + " Speaking something");
        }

        public void speaking(String message) {
            System.out.println(name + " said: \""+message+"\"");
        }

        public void listening() {
            System.out.println(name + " is listening now");
        }

        public String getColorOfHair() {
            return colorOfHair;
        }

        public void setColorOfHair(String colorOfHair) {
            this.colorOfHair = colorOfHair;
        }

        public String getColorOfEyes() {
            return colorOfEyes;
        }

        public void setColorOfEyes(String colorOfEyes) {
            this.colorOfEyes = colorOfEyes;
        }

        public Head(String colorOfHair, String colorOfEyes) {
            this.colorOfEyes = colorOfEyes;
            this.colorOfHair = colorOfHair;
        }
    }

    private static class Leg {
        private int footSize;

        private boolean integrityOfLeg = true;

        public boolean getIntegrityOfLeg() {
            return integrityOfLeg;
        }

        public void setIntegrityOfLeg(boolean integrityOfLeg_) {
            if (integrityOfLeg == integrityOfLeg_) {
                if (integrityOfLeg) {
                    System.out.println(name + ": The leg is already whole");
                } else {
                    System.out.println(name + ": The leg is already broken");
                }
            } else {
                integrityOfLeg = integrityOfLeg_;
                if (integrityOfLeg) {
                    System.out.println(name + ": The leg is repaired");
                } else {
                    System.out.println(name + ": The leg is broken");
                }
            }
        }

        public int getFootSize() {
            return footSize;
        }

        public void setFootSize(int footSize) {
            if (footSize >= 0) {
                this.footSize = footSize;
            } else {
                System.out.println("The size is never been < 0");
            }

        }

        public Leg(int footSize) {
            this.footSize = footSize;
        }

        public void walking() {
            System.out.println(name + " go somewhere");
        }

        public void kicking() {
            System.out.println(name + " successfully kicked");
        }
    }

    private static class Hand {

        private boolean integrityOfHand = true;

        public boolean getIntegrityOfHand() {
            return integrityOfHand;
        }

        public void setIntegrityOfHand(boolean integrityOfHand_) {
            if (integrityOfHand == integrityOfHand_) {
                if (integrityOfHand) {
                    System.out.println(name + ": The hand is already whole");
                } else {
                    System.out.println(name + ": The hand is already broken");
                }
            } else {
                integrityOfHand = integrityOfHand_;
                if (integrityOfHand) {
                    System.out.println(name + ": The hand is repaired");
                } else {
                    System.out.println(name + ": The hand is broken");
                }
            }
        }
        public void taking() {
            System.out.println(name + " took something");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Human.name = name;
    }

    public Human(String name, int age, char gender, String colorOfHair, String colorOfEyes, int height, String skinColor, int footSize) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.skinColor = skinColor;
        head = new Head(colorOfHair,colorOfEyes);
        legs[0] = new Leg(footSize);
        legs[1] = new Leg(footSize);
        hands[0] = new Hand();
        hands[1] = new Hand();
    }

    public boolean getIntegrityOfNose() {
        return head.getIntegrityOfNose();
    }

    public void setIntegrityOfNose(boolean integrityOfNose_) {
        head.setIntegrityOfNose(integrityOfNose_);
    }

    public void thinking() {
        head.thinking();
    }

    public void speaking() {
        head.speaking();
    }

    public void speaking(String message){
        head.speaking(message);
    }

    public void listening() {
        head.listening();
    }

    public String getColorOfHair() {
        return head.getColorOfHair();
    }

    public void setColorOfHair(String colorOfHair) {
        head.setColorOfHair(colorOfHair);
    }

    public String getColorOfEyes() {
        return head.getColorOfEyes();
    }

    public void setColorOfEyes(String colorOfEyes) {
        head.setColorOfEyes(colorOfEyes);
    }

    public boolean getIntegrityOfLeg(int number1_or_2) {
        return legs[number1_or_2-1].getIntegrityOfLeg();
    }

    public void setIntegrityOfLeg(int number1_or_2, boolean integrityOfLeg_) {
        legs[number1_or_2-1].setIntegrityOfLeg(integrityOfLeg_);
    }

    public int getFootSize(int number1_or_2) {
        return legs[number1_or_2-1].getFootSize();
    }

    public void setFootSize(int number1_or_2, int size) {
        legs[number1_or_2-1].setFootSize(size);
    }

    public void walking(int number1_or_2) {
        legs[number1_or_2-1].walking();
    }

    public void kicking(int number1_or_2) {
        legs[number1_or_2-1].kicking();
    }

    public boolean getIntegrityOfHand(int number1_or_2) {
        return hands[number1_or_2-1].getIntegrityOfHand();
    }

    public void setIntegrityOfHand(int number1_or_2, boolean integrityOfHand_) {
        hands[number1_or_2-1].setIntegrityOfHand(integrityOfHand_);
    }

    public void taking(int number1_or_2) {
        hands[number1_or_2-1].taking();
    }
}