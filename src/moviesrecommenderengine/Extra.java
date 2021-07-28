/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesrecommenderengine;


public class Extra {
        static void check()
    {
    //        RecommenderEngineController objRecommenderEngineController = new RecommenderEngineController();
//        ArrayList<MovieDTO> popularMoviesList = objRecommenderEngineController.getTop30PopularMovies();
//        System.out.println("\n\nTop recent movies are:");
//        for(int i = 0; i < popularMoviesList.size(); i++)
//        {
//            System.out.println(i+1 + " " + popularMoviesList.get(i).title);
//            System.out.println("\t\tMore from this writer......");
//            ArrayList<MovieDTO> otherMoviesForThisWriter = objRecommenderEngineController.getMoreMoviesForWriter(popularMoviesList.get(i));
//            
//            if(otherMoviesForThisWriter.size() <= 0)
//            {
//                System.out.println("\t\t\t\tNo more movies of this writer found!");
//            }
//            else if(otherMoviesForThisWriter.size() >= 1)
//            {
//                for(int j = 0; j < otherMoviesForThisWriter.size(); j++)
//                {
//                    System.out.println("\t\t\t\t" + (j+1) + " " + otherMoviesForThisWriter.get(j).title);
//                }
//            }
//            
//            System.out.println("\t\tMore from this director......");
//            ArrayList<MovieDTO> otherMoviesForThisDirector = objRecommenderEngineController.getMoreMoviesForDirector(popularMoviesList.get(i));
//            
//            if(otherMoviesForThisDirector.size() <= 0)
//            {
//                System.out.println("\t\t\t\tNo more movies of this director found!");
//            }
//            else if(otherMoviesForThisDirector.size() >= 1)
//            {
//                for(int j = 0; j<otherMoviesForThisDirector.size(); j++)
//                {
//                    System.out.println("\t\t\t\t" + (j+1) + " " + otherMoviesForThisDirector.get(j).title);
//                }
//            }
//            
//            System.out.println("\t\tMore from this producer......");
//            ArrayList<MovieDTO> otherMoviesForThisProducer = objRecommenderEngineController.getMoreMoviesForProducer(popularMoviesList.get(i));
//            
//            if(otherMoviesForThisProducer.size() <= 0)
//            {
//                System.out.println("\t\t\t\tNo more movies of this producer found!");
//            }
//            else if(otherMoviesForThisProducer.size() >= 1)
//            {
//                for(int j = 0; j < otherMoviesForThisProducer.size(); j++)
//                {
//                    System.out.println("\t\t\t\t" + (j+1) + " " + otherMoviesForThisProducer.get(j).title);
//                }
//            }
//        }
//      
//        System.out.println("\n\n_________________________________________________________\n\n");
//        Scanner objScanner = new Scanner(System.in);
//
//            
//        System.out.println("\n\nSearch for a movie by its title....");
//        System.out.print("Enter title: ");
//        String title = objScanner.nextLine();
//        ArrayList<MovieDTO> moviesWithSimilarTitleList = objRecommenderEngineController.searchMovieByTitle(title);
//        MovieDTO movie = new MovieDTO();
//        
//        if(moviesWithSimilarTitleList.size() <= 0)
//        {
//            System.out.println("No such movie found...");
//        }
//        else if(moviesWithSimilarTitleList.size() == 1)
//        {
//            movie =  moviesWithSimilarTitleList.get(0);
//        
//            System.out.println("\n\nWould you like popularity filter... So that system recommends "
//                    + "popular similar movies");
//            System.out.println("\nEnter y for yes and n for no");
//            System.out.print("Enter choice: ");
//            String choiceOFPopularity = objScanner.nextLine();
//
//
//            boolean popularityFilter; 
//
//            switch (choiceOFPopularity) 
//            {
//                case "y":
//                    popularityFilter = true;
//                    break;
//                case "n":
//                    popularityFilter = false;
//                    break;
//                default:
//                    popularityFilter = true;
//                    break;
//            }
//                
//            ArrayList<MovieDTO> movies = objRecommenderEngineController.recommendSimilarMovies(movie, popularityFilter);
//
//            if(movies.size() == 0)
//            {
//                System.out.println("\n\nNo similar movies found");
//            }
//            else
//            {
//                System.out.println("\n\nSimilar movie to " + movie.title + " are:");
//                for(int i = 0; i < movies.size(); i++)
//                {
//                    System.out.println(i+1 + " " + movies.get(i).title);
//                }
//            }
//        }
//        else
//        {
//            System.out.println(moviesWithSimilarTitleList.size() + " such movies were found");
//            
//            for(int i = 0; i < moviesWithSimilarTitleList.size(); i++)
//            {
//                System.out.println((i+1) + ". " + moviesWithSimilarTitleList.get(i).title);
//            }
//            
//            System.out.println("\n\nSelect one movie by typing its number ");
//            System.out.print("Enter choice: ");
//            int choice = objScanner.nextInt();
//            if(choice <= 0 || choice > moviesWithSimilarTitleList.size())
//            {
//                System.out.print("\n\nInvalid choice ");
//            }
//            else
//            {
//                movie =  moviesWithSimilarTitleList.get(choice - 1);
//                
//                System.out.println("\n\nWould you like popularity filter... So that system recommends "
//                        + "popular similar movies");
//                System.out.println("\nEnter y for yes and n for no");
//                System.out.print("Enter choice: ");
//                String choiceOFPopularity = objScanner.next();
//                
//                boolean popularityFilter; 
//                
//                switch (choiceOFPopularity) 
//                {
//                    case "y":
//                        popularityFilter = true;
//                        break;
//                    case "n":
//                        popularityFilter = false;
//                        break;
//                    default:
//                        popularityFilter = true;
//                        break;
//                }
//                
//                ArrayList<MovieDTO> movies = objRecommenderEngineController.recommendSimilarMovies(movie, popularityFilter);
//
//                if(movies.size() == 0)
//                {
//                    System.out.println("\n\nNo similar movies found");
//                }
//                else
//                {
//                    System.out.println("\n\nSimilar movie to " + movie.title + " are:");
//                    for(int i = 0; i < movies.size(); i++)
//                    {
//                        System.out.println(i+1 + " " + movies.get(i).title);
//                    }
//                }
//            }
//        }
    }
}
