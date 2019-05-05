import angular from 'angular';

class PaiService {

    constructor($http) {
        this.$http = $http;
        const apiBase = "http://localhost:8080";
        this.path =  apiBase + "/pai";
    }
 
    getPai() {
        return this.$http.get(this.path/consultar);
    }
 
    
    /*
    consultarPai(): Observable<string> {
        return this.http.post<string>(`${this.path}/consultar`);
    }
   
    salvarPai(): Observable<string> {
        return this.http.post<string>(`${this.path}/salvar`);
    }
    
    excluirPai(): Observable<string> {
        return this.http.post<string>(`${this.path}/excluir`);
    }
    */

}

export default angular.module('services.pai-service', [])
.service('paiService', PaiService)
.name;