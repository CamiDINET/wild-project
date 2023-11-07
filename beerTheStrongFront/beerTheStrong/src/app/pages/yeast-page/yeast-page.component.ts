import { Component } from '@angular/core';
import { Yeast } from 'src/app/class/yeast';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-yeast-page',
  templateUrl: './yeast-page.component.html',
  styleUrls: ['./yeast-page.component.css']
})
export class YeastPageComponent {
  yeastsToDisplay!: Yeast[];

  constructor(private apiService: ApiService){}
  ngOnInit(){

    this.apiService.getAllInStock("yeasts").subscribe((data) => {this.yeastsToDisplay= data});
    
  }
}
