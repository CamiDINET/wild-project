import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Malt } from 'src/app/class/malt';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-recipe-page',
  templateUrl: './recipe-page.component.html',
  styleUrls: ['./recipe-page.component.css']
})
export class RecipePageComponent {
  
  displayCreate:boolean= false;
  recipesToDisplay!: any[];
  maltsToDisplay!: Malt[];
  actualRoute!: any;

  constructor(private apiService: ApiService, private activatedRoute: ActivatedRoute){}

  ngOnInit(){

    this.apiService.getAllInStock("malts").subscribe((data) => {this.maltsToDisplay= data;
    console.log(this.maltsToDisplay);
    
    });
    this.actualRoute = this.activatedRoute.routeConfig?.path;
  }


  displayCreateRecipe(){

    this.displayCreate = true;
  }
  

}
