import { Component, OnInit } from '@angular/core';
import { Hop } from 'src/app/class/hop';
import { HopStock } from 'src/app/class/hop-stock';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-hop-page',
  templateUrl: './hop-page.component.html',
  styleUrls: ['./hop-page.component.css']
})
export class HopPageComponent implements OnInit{

  hopsInStockToDisplay!: HopStock[];
  hopsToDisplay!: Hop[];
  searchTerm: String = "";
  activateHop:boolean = false;

  constructor(private apiService: ApiService){}

  ngOnInit(){
    this.apiService.getAllInStock("hops").subscribe((data) => {
      this.hopsInStockToDisplay = data;});
    this.apiService.getAll("hops").subscribe((data) => {
      this.hopsToDisplay = data;
      this.apiService.sortNamesAlphabetically(this.hopsToDisplay);
    }); 
  }

  searchFilter(e:Event){
      this.searchTerm = e.toString();        
  }
  
  searchIngredient(hopToSearch:Hop){
    if(hopToSearch.name.toLowerCase().includes(this.searchTerm.toLowerCase()) || hopToSearch.characterDescription.toLowerCase().includes(this.searchTerm.toLowerCase()) || hopToSearch.style.toLowerCase().includes(this.searchTerm.toLowerCase())){
      return true;
    } else {
      return false;
    }
  }
  onClick(){
    this.activateHop == false ? this.activateHop = true : this.activateHop = false;
  }

}
