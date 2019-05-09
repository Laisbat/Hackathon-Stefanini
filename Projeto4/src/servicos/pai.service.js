import angular from 'angular';

class PaiService {

    constructor($http) {
        this.$http = $http;
        const apiBase = "http://localhost:8080";
        this.path =  apiBase + "/pai";
    }

    getPais() {
        return this.$http.get(`${this.path}/consultar`);
    }
   
    salvarPai(pai) {
        return this.$http.post(`${this.path}/salvar`, pai);
    }
    
    excluirPai(id) {
        return this.$http.delete(`${this.path}/excluir?pai=${id}`);
    }

}

export default angular.module('services.pai-service', [])
.service('paiService', PaiService)
.name;