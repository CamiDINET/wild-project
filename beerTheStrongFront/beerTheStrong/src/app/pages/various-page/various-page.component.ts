import { Component } from '@angular/core';
import { Various } from 'src/app/class/various';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-various-page',
  templateUrl: './various-page.component.html',
  styleUrls: ['./various-page.component.css']
})
export class VariousPageComponent {
  variousToDisplay!: Various[];
  

  constructor(private apiService: ApiService){}
  ngOnInit(){

    this.apiService.getAllInStock("various").subscribe((data) => {this.variousToDisplay= data});
    
  }
}
