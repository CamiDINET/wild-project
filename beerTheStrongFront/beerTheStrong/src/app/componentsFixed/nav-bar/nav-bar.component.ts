import { Component, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent {


constructor(private activatedRoute: ActivatedRoute){}


  isActivated(logo :string){
  if(this.activatedRoute.routeConfig?.path === logo){
    return true;
  } else {
    return false;
  }

  }
}
