import { Component, Input, OnInit, Type } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HopStock } from 'src/app/class/hop-stock';
import { Ingredient } from 'src/app/class/ingredient';

@Component({
  selector: 'app-ingredient',
  templateUrl: './ingredient.component.html',
  styleUrls: ['./ingredient.component.css']
})
export class IngredientComponent implements OnInit{
  @Input() ingredient!: Ingredient;
  @Input() hop!: HopStock;
  @Input() i!: number;
  ingredientSelected: string | undefined;
  srcImg: string | undefined;
  typeOfIngredient: string | undefined;

  constructor(private route: ActivatedRoute){};

  ngOnInit(){
    this.typeOfIngredient = this.route.routeConfig?.path;
      if(this.typeOfIngredient!=="various"){
        this.srcImg=`./assets/${this.typeOfIngredient}.svg`;         
  }
}
}