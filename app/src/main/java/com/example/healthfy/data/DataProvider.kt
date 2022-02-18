package com.example.healthfy.data

import com.example.healthfy.R

object  DataProvider{

    val disease =
        Disease(
            id = 1,
            diseaseImage = R.drawable.hypertension,
            title = "Hypertension",
            ingredients = "xyz",
            instructions = "when hot"
        )

    val diseaseList = listOf(
        disease,
        Disease(
            id = 2,
            diseaseImage = R.drawable.covid,
            title = "Covid 19",
            ingredients = "jjf",
            instructions = "uns"
        ),
        Disease(
            id = 3,
            diseaseImage = R.drawable.diabetes,
            title = "Diabetes",
            ingredients = "jjf",
            instructions = "uns"
        ),
        Disease(
            id = 4,
            diseaseImage = R.drawable.athritis,
            title = "Arthritis",
            ingredients = "jjf",
            instructions = "uns"
        ),
        Disease(
            id = 5,
            diseaseImage = R.drawable.hypogly,
            title = "Hypoglycemia",
            ingredients = "jjf",
            instructions = "uns"
        ),
        Disease(
            id = 6,
            diseaseImage = R.drawable.kidnry,
            title = "Kidney Disease",
            ingredients = "jjf",
            instructions = "uns"
        ),
        Disease(
            id = 7,
            diseaseImage = R.drawable.chol,
            title = "High Cholesterol",
            ingredients = "jjf",
            instructions = "uns"
        ),
        Disease(
            id = 8,
            diseaseImage = R.drawable.gout,
            title = "Gout",
            ingredients = "jjf",
            instructions = "uns"
        ),
        Disease(
            id = 9,
            diseaseImage = R.drawable.celatic,
            title = "Celiac Disease",
            ingredients = "jjf",
            instructions = "uns"
        ),
        Disease(
            id = 10,
            diseaseImage = R.drawable.hiv,
            title = "HIV&AIDS",
            ingredients = "jjf",
            instructions = "uns"
        ),

    )
}
