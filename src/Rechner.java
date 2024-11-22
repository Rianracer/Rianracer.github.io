public class Rechner {

    private Float a;
    private Float b;
    public Rechner(Float a, Float b){
        this.a= a;
        this.b= b;
    }

    public Float rechne(String mathesymbol) {

        return switch (mathesymbol) {
            case "-" -> a - b;
            case "+" -> a + b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0F;
        };
    }
}

