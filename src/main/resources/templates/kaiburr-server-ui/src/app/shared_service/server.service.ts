import { Injectable } from '@angular/core';
import { Http ,Response ,Headers, RequestOptions } from '@angular/http';
import{ Observable }   from 'rxjs';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';

import{Server}  from '../server';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
@Injectable()
export class ServerService {

  private baseUrl:string='http://localhost:8080/server';
  private headers = new Headers ({'Content-Type' : 'application/json'});
  private options = new RequestOptions({headers:this.headers});
  private server:Server;

  constructor(private _http : Http ) { }

  getItems() {
    return  this._http.get(this.baseUrl+'/',this.options).map((response:Response)=>response.json())
    .catch(this.errorHandler);
  }

  getItem(id:Number){

    return this._http.get(this.baseUrl+'/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  deleteItem(id:Number){

    return this._http.delete(this.baseUrl+'/item/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }


  addItem(server:Server){

    return this._http.post(this.baseUrl+'/',JSON.stringify(server),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  saveOrUpdateItem(server:Server){

    return this._http.put(this.baseUrl+'/item',JSON.stringify(server),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  errorHandler(error:Response) {
    return Observable.throw(error||"SERVER ERROR");
  }

  setter(server:Server) {
    this.server=server;
  }
   getter() {
   return this.server;
  }

}
