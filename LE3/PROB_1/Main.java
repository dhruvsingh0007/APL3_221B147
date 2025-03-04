class Main {
    public static void main(String[] args) {
        
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Dhuryodhan dhuryodhan = new Dhuryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("Pandavs:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("Kauravs:");
        dhuryodhan.fight();
        dhuryodhan.obey();
        dhuryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
