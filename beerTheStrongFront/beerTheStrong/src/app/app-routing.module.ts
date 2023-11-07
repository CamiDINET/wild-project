import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { HopPageComponent } from './pages/hop-page/hop-page.component';
import { MaltPageComponent } from './pages/malt-page/malt-page.component';
import { RecipePageComponent } from './pages/recipe-page/recipe-page.component';
import { YeastPageComponent } from './pages/yeast-page/yeast-page.component';
import { VariousPageComponent } from './pages/various-page/various-page.component';

const routes: Routes = [

{path:'hops',
component: HopPageComponent},
{path:'malts',
component: MaltPageComponent},
{path: 'various',
component: VariousPageComponent},
{path: 'recipe',
component: RecipePageComponent},
{path: 'yeasts',
component: YeastPageComponent},
{path:'',
component: HomePageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
