import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  url: string = 'http://localhost:8080/';
  constructor(private http: HttpClient) {}
  
  getAllInStock(ingredient: string): Observable<any>{
    return this.http.get<any>(this.url + ingredient + "Stock");
  }
  getAll(ingredient: string): Observable<any>{
    return this.http.get<any>(this.url + ingredient);
  }
  //tri par ordre alphabétique
  sortNamesAlphabetically(arr : any[]){
    arr.sort((a, b) => a.name > b.name ? 1 : -1)
      }
}
