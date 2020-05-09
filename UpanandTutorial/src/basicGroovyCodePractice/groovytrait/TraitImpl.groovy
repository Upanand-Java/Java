package basicGroovyCodePractice.groovytrait

class TraitImpl implements Testtrait {
    @Override
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
    }
}
