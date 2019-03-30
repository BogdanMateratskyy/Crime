package utils

trait CrimeReader{

  def readCrime(): Seq[Crime]
}

case class Crime (CrimeID: String,
                  Month: String,
                  ReportedBy: String,
                  FallsWithin: String,
                  Longitude: Float,
                  Latitude: Float,
                  Location: String,
                  LSOA_code: String,
                  LSOA_name: String,
                  CrimeType: String,
                  LastOutcomeCategory: String,
                  Context: String)
