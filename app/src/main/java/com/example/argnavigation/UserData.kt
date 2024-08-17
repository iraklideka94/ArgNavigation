package com.example.argnavigation

data class User(
    val id: Int,
    val name: String,
    val phone: String,
    val email: String,
    val address: String
)

val users = listOf(
    User(
        id = 1,
        name = "John Doe",
        phone = "555-1234",
        email = "johndoe@example.com",
        address = "123 Maple St."
    ),
    User(
        id = 2,
        name = "Jane Smith",
        phone = "555-5678",
        email = "janesmith@example.com",
        address = "456 Oak St."
    ),
    User(
        id = 3,
        name = "Michael Brown",
        phone = "555-8765",
        email = "michaelbrown@example.com",
        address = "789 Pine St."
    ),
    User(
        id = 4,
        name = "Emily Johnson",
        phone = "555-4321",
        email = "emilyjohnson@example.com",
        address = "321 Birch St."
    ),
    User(
        id = 5,
        name = "David Williams",
        phone = "555-6789",
        email = "davidwilliams@example.com",
        address = "654 Cedar St."
    ),
    User(
        id = 6,
        name = "Sarah Davis",
        phone = "555-9876",
        email = "sarahdavis@example.com",
        address = "987 Elm St."
    ),
    User(
        id = 7,
        name = "James Miller",
        phone = "555-2468",
        email = "jamesmiller@example.com",
        address = "246 Spruce St."
    ),
    User(
        id = 8,
        name = "Jessica Wilson",
        phone = "555-1357",
        email = "jessicawilson@example.com",
        address = "135 Redwood St."
    ),
    User(
        id = 9,
        name = "Robert Moore",
        phone = "555-9753",
        email = "robertmoore@example.com",
        address = "975 Ash St."
    ),
    User(
        id = 10,
        name = "Laura Taylor",
        phone = "555-8642",
        email = "laurataylor@example.com",
        address = "864 Poplar St."
    )
)