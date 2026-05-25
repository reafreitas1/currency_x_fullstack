import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CambioService {

  private apiUrl = 'http://localhost:8080/api/cambio';

  constructor(private http: HttpClient) { }

  getTaxas(): Observable<any> {
    return this.http.get(this.apiUrl);
  }
}
