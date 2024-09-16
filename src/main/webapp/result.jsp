<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculation Results</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 50px;
            background-color: #f9f9f9;
        }
        .results {
            display: inline-block;
            text-align: left;
            padding: 20px;
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .results h2 {
            color: #4CAF50;
        }
        .results p {
            margin: 10px 0;
        }
        .error {
            color: #d9534f;
            margin-top: 20px;
        }
        .back-to-home {
            margin-top: 20px;
            text-align: center;
        }
        .back-to-home a {
            text-decoration: none;
            color: #4CAF50;
            font-size: 18px;
            font-weight: bold;
        }
        .back-to-home a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h2>Calculation Results</h2>
    <div class="results">
        <p><strong>Core Factors:</strong> ${result.coreFactors}</p>
        <p><strong>Effective Volume (Ve):</strong> ${result.effectiveVolume}</p>
        <p><strong>Effective Length (le):</strong> ${result.effectiveLength}</p>
        <p><strong>Effective Area (Ae):</strong> ${result.effectiveArea}</p>
        <p><strong>Minimum Area (An):</strong> ${result.minimumArea}</p>
    </div>
    <div class="back-to-home">
        <a href="index.html">Back to Home</a>
    </div>
</body>
</html>
