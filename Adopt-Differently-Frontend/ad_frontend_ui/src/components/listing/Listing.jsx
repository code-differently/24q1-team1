import React from "react";
import "./Listing.css";
import {useQuery} from '@tanstack/react-query';


export const Listing = () => {
    const query = useQuery({
        queryKey: [],
            queryFn: async () => {const res = await fetch( 'https://api.adoptapet.me/ac/12');
            return await res.json();
        },
    });
    return (
        <div>
            <h1>Listing</h1>
            <p>{query.data}</p>
        </div>
    )
}