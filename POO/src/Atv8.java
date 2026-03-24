public class Atv8 {
    public static void main(String[] args) {
        Contribuinte contribuinte1 = new Contribuinte("Altherion Silva","14278596321","Reino de Valdoria",18500);
        Contribuinte contribuinte2 = new Contribuinte("Kael Draven Souza","38921465709","Terras Sombras de Nox",9200);
        Contribuinte contribuinte3 = new Contribuinte("Lyara Fernvale Costa","51790328466","Floresta de Elunaria",25750);
        Contribuinte contribuinte4 = new Contribuinte("Thorgar Pedraforte Alves","76811245930","Montanhas de Karak-Dum",32000);
        Contribuinte contribuinte5 = new Contribuinte("Seraphina Noctis Ribeiro","90466712855","Cidade Arcana de Velkyn",14300);

        System.out.printf("Nome: %s\nImposto: %.2f\n", contribuinte1.nome, contribuinte1.impostoPagar());
        System.out.printf("Nome: %s\nImposto: %.2f\n", contribuinte2.nome, contribuinte2.impostoPagar());
        System.out.printf("Nome: %s\nImposto: %.2f\n", contribuinte3.nome, contribuinte3.impostoPagar());
        System.out.printf("Nome: %s\nImposto: %.2f\n", contribuinte4.nome, contribuinte4.impostoPagar());
        System.out.printf("Nome: %s\nImposto: %.2f\n", contribuinte5.nome, contribuinte5.impostoPagar());
    }
}
