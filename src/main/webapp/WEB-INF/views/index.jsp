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

    <script src="/resources/main.js"></script>
</head>

<body>
    <h1>JSP</h1>
    <script>
        window.addEventListener("load", function () {
            
            console.log("load");
            console.log("load");
            console.log("load");
            

            microsoftTeams.initialize();
            let popUpParameters = {
                url: "/jsp/popup",
                successCallback: function (result) {
                    //TeamsConfiguration.fn.doLoginSuccess(result.psnId, result.userName);
                    console.log(result);
                    microsoftTeams.pages.config.registerOnSaveHandler((saveEvent) => {
                        const configPromise = microsoftTeams.pages.config.setConfig({
                            websiteUrl: "https://4b24-1-214-255-114.jp.ngrok.io",
                            contentUrl: "https://4b24-1-214-255-114.jp.ngrok.io/jsp/main",
                            entityId: "myhello-tab",
                            suggestedDisplayName: "myhello-tab"
                        });
                        configPromise.
                            then((result) => { saveEvent.notifySuccess() }).
                            catch((error) => { saveEvent.notifyFailure("failure message") });
                    });

                    microsoftTeams.pages.config.setValidityState(true);

                }
            }
            microsoftTeams.authentication.authenticate(popUpParameters);
        });

    </script>






</body>

</html>