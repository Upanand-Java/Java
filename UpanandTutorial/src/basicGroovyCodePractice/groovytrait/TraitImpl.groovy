package basicGroovyCodePractice.groovytrait

class TraitImpl implements Testtrait {
    /*@Override
    String foo() {
        return null
    }

    @Override
    String test() {
        return "In test method!!"
    }

    @Override
    String fly(){
        return "Why FLying??"
    }*/

    @Override
    String foo() {
        return null
    }

    @Override
    String test() {
        return null
    }

    public static void main(String[] args) {
        TraitImpl traitVar = new TraitImpl(name: "My name is upanand")
        println(traitVar.name)

    }

    @Override
    String name() {
        return null
    }
}
