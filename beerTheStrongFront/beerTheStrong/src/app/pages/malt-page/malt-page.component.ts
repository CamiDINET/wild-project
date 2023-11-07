import { Component } from '@angular/core';
import { Malt } from 'src/app/class/malt';
import { MaltStock } from 'src/app/class/malt-stock';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-malt-page',
  templateUrl: './malt-page.component.html',
  styleUrls: ['./malt-page.component.css']
})
export class MaltPageComponent {
  maltsInStockToDisplay!: MaltStock[];
  maltsToDisplay!:Malt[];
  searchTerm: String = "";

  constructor(private apiService: ApiService){}

  ngOnInit(){
    this.apiService.getAllInStock("malts").subscribe((data) => {
      this.maltsInStockToDisplay = data});
    this.apiService.getAll("malts").subscribe((data)=>{
      this.maltsToDisplay = data});
  }

  searchFilter(e:Event){
    this.searchTerm = e.toString();        
}

  searchIngredient(hopToSearch:Malt){
    if(hopToSearch.name.toLowerCase().includes(this.searchTerm.toLowerCase()) || hopToSearch.description.toLowerCase().includes(this.searchTerm.toLowerCase()) || hopToSearch.style.toLowerCase().includes(this.searchTerm.toLowerCase())){
      return true;
    } else {
      return false;
    }
  }
}
