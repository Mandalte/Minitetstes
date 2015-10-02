package minitetstes

class Tarefa {

    String titulo
    String descricao
    Date   prazo
    Membro membro

    //static belongsTo = [membro: Membro]

    static constraints = {
        membro nullable: false
    }

    // Modificando o modo como a representação textual é gerada
    String toString() {
        this.titulo
    }
}
