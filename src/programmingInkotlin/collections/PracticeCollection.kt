package programmingInkotlin.collections

data class User(
    val id: Int,
    val name: String,
    val age: Int,
    val email: String,
    val phone: String,
    val city: String,
    val country: String,
    val profession: String,
    val salary: Double,
    val isActive: Boolean,
    val gender: String,
    val experience: Int,
    val department: String,
    val rating: Float,
    val married: Boolean
)
data class UserInfo(
    val name: String,
    val salary: Double
)
fun main() {
    val users = listOf(
            User(1, "Amit", 25, "amit@gmail.com", "9000000001", "Delhi", "India", "Android", 50000.0, true, "Male", 2, "Mobile", 4.5f, false),
            User(2, "Rahul", 28, "rahul@gmail.com", "9000000002", "Noida", "India", "Backend", 70000.0, true, "Male", 5, "Server", 4.8f, true),
            User(3, "Sneha", 24, "sneha@gmail.com", "9000000003", "Mumbai", "India", "QA", 45000.0, true, "Female", 2, "Testing", 4.2f, false),
            User(4, "Priya", 30, "priya@gmail.com", "9000000004", "Pune", "India", "HR", 65000.0, false, "Female", 7, "HR", 4.1f, true),
            User(5, "Karan", 27, "karan@gmail.com", "9000000005", "Jaipur", "India", "Android", 60000.0, true, "Male", 4, "Mobile", 4.6f, false),
            User(6, "Anjali", 26, "anjali@gmail.com", "9000000006", "Lucknow", "India", "Designer", 52000.0, true, "Female", 3, "UI/UX", 4.3f, false),
            User(7, "Rohit", 31, "rohit@gmail.com", "9000000007", "Hyderabad", "India", "DevOps", 90000.0, true, "Male", 8, "Cloud", 4.9f, true),
            User(8, "Neha", 23, "neha@gmail.com", "9000000008", "Chennai", "India", "QA", 42000.0, false, "Female", 1, "Testing", 3.9f, false),
            User(9, "Vikas", 29, "vikas@gmail.com", "9000000009", "Bangalore", "India", "Backend", 85000.0, true, "Male", 6, "Server", 4.7f, true),
            User(10, "Pooja", 32, "pooja@gmail.com", "9000000010", "Kolkata", "India", "Manager", 120000.0, true, "Female", 10, "Management", 4.9f, true),
            User(11, "Arjun", 26, "arjun@gmail.com", "9000000011", "Delhi", "India", "Android", 58000.0, true, "Male", 3, "Mobile", 4.4f, false),
            User(12, "Meera", 29, "meera@gmail.com", "9000000012", "Noida", "India", "Frontend", 68000.0, false, "Female", 5, "Web", 4.5f, true),
            User(13, "Nikhil", 27, "nikhil@gmail.com", "9000000013", "Indore", "India", "Data Engineer", 88000.0, true, "Male", 5, "Data", 4.8f, false),
            User(14, "Riya", 22, "riya@gmail.com", "9000000014", "Patna", "India", "Intern", 25000.0, true, "Female", 0, "Training", 4.0f, false),
            User(15, "Mohit", 35, "mohit@gmail.com", "9000000015", "Surat", "India", "Architect", 150000.0, true, "Male", 12, "Architecture", 5.0f, true),
            User(16, "Simran", 28, "simran@gmail.com", "9000000016", "Chandigarh", "India", "Android", 72000.0, true, "Female", 6, "Mobile", 4.7f, true),
            User(17, "Deepak", 33, "deepak@gmail.com", "9000000017", "Bhopal", "India", "Backend", 98000.0, false, "Male", 9, "Server", 4.6f, true),
            User(18, "Kavita", 24, "kavita@gmail.com", "9000000018", "Nagpur", "India", "Support", 38000.0, true, "Female", 2, "Support", 4.1f, false),
            User(19, "Ajay", 30, "ajay@gmail.com", "9000000019", "Kanpur", "India", "Security", 95000.0, true, "Male", 8, "Security", 4.8f, true),
            User(20, "Sonal", 27, "sonal@gmail.com", "9000000020", "Ahmedabad", "India", "Frontend", 70000.0, true, "Female", 4, "Web", 4.5f, false)
        )

    val list = users.filter { it.profession == "Backend" }.map { UserInfo(it.name,it.salary) }
    list.forEach(::println)

//// Map<id, User>
//    val userMap: Map<Int, User> = users.associateBy { it.id }
//// Set<User>
//    val userSet: Set<User> = users.toSet()
//    println("===== List =====")
//    users.forEach(::println)
//    println("\n===== Map =====")
//    userMap.forEach { (id, user) ->
//        println("$id -> $user")
//    }
//    println("\n===== Set =====")
//    userSet.forEach(::println)
}

