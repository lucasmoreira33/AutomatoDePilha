public void main(String[] args) {
    AutomatoDePilha ap = new AutomatoDePilha();


    String[] testes = {"", "01", "0011", "000111", "00001111", "0001"};

    for (String teste : testes) {
        if (ap.reconhecer(teste)) {
            System.out.println("Entrada \"" + teste + "\" foi aceita.");
        } else {
            System.out.println("Entrada \"" + teste + "\" foi rejeitada.");
        }
    }
}
