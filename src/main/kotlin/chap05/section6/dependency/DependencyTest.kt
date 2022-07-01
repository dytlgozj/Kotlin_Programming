package chap05.section6.dependency

class Patient(val name: String, val id: Int) {
    fun doctorList(d: Doctor) {
        println("Patient : $name, Doctor : ${d.name}")
    }
}

class Doctor(val name: String, val p: Patient) {
    fun patientList() {
        println("Doctor : $name, Patient : ${p.name}")
        println("Patient Id : ${p.id}")
    }
}

fun main() {
    val patient1 = Patient("Kildong", 1234)
    val doc1 = Doctor("KimSabu", patient1)

    doc1.patientList()
}
