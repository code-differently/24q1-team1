import React from "react";
import "./Listings.css";
import { Route } from "react-router-dom";
import data from "../../resources/cats.json";
import { QueryClient, QueryClientProvider } from '@tanstack/react-query'
import { ListingPage } from "../../pages/listingpage/ListingPage.jsx";
import { NavLink } from "react-router-dom";
import noImage from '../../assets/noImage.png'


const queryClient = new QueryClient();
export function Listings() {
    const catInfo = data.cats;    
    return (
        <div>
            {console.log(catInfo)}
            <div className="listings">
                {catInfo.map((catfo) => (
                    
                    <>      
                        <NavLink to={`/post/${catfo.id}`} key={catfo.id} className="listing-wrapper">
                            <div className="listing">
                                <div key={catfo.id}>
                                    <li>
                                        
                                        <img src={NoImage(catfo.image)} alt={catfo.name} />
                                        <h1>{catfo.name}</h1>
                                        <p className="owner">by {catfo.owner}</p>
                                        <p>{catfo.age} years old</p>
                                    </li>
                                </div>
                            </div>
                        </NavLink>
                    </>
                ))}
                
            </div>
        </div>
    );
}
function NoImage(img) {
    if (img === null || img === undefined || img === "") {
        return noImage
    }
    else {
        return img
    }
}