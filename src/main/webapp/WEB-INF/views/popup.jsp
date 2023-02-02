<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <script src="https://res.cdn.office.net/teams-js/2.0.0/js/MicrosoftTeams.min.js"
        integrity="sha384-QtTBFeFlfRDZBfwHJHYQp7MdLJ2C3sfAEB1Qpy+YblvjavBye+q87TELpTnvlXw4" crossorigin="anonymous">
        </script>
    <script>

        window.addEventListener('load', function (event) {
            microsoftTeams.initialize();
            
            document.querySelector("#btnAuth").addEventListener('click', function () {
                microsoftTeams.authentication.notifySuccess({ userName: "test" });
            });
        });

    </script>

</head>

<body>

    <button id="btnAuth">Authenticate</button>
</body>

</html>