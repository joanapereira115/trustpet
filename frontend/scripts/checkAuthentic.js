var vm = new Vue({
    el: "#checkAuthentic",
    created: async function () {
        if (localStorage.token) {
            const response = await fetch("http://localhost:8080/trustpet_war_exploded/Index", {
                headers: {
                    'Content-Type': 'application/json; charset=utf-8',
                    'Token': localStorage.token
                },
                method: "GET"
            })
            const content = await response.json()
            if (content.email) {
                if (content.tipo == 'dono') {
                    window.location.replace("http://localhost/indexDono.html")
                } else if (content.tipo == 'petsitter') {
                    window.location.replace("http://localhost/indexPetsitter.html")
                }
            }
        }
        else {
            window.location.replace("http://localhost/index.html")
        }
    }
})